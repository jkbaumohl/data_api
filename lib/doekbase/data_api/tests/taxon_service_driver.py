# Stdlib
import logging
import sys

# Third-party
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
from thrift.server import TServer

# Local
from doekbase.data_api.taxonomy.taxon.service import thrift_service
from doekbase.data_api.taxonomy.taxon.service.interface import TaxonService
from doekbase.data_api.util import get_logger

DEFAULT_WS_URL = 'https://ci.kbase.us/services/ws/'
DEFAULT_SHOCK_URL = 'https://ci.kbase.us/services/shock-api/'

_log = get_logger('thrift')  # set up a logger for Thrift messages
_log.setLevel(logging.DEBUG)

def get_services_dict(ws=DEFAULT_WS_URL, shock=DEFAULT_SHOCK_URL):
    return {'workspace_service_url': ws,
            'shock_service_url': shock}

def taxon_service():
    handler = TaxonService(services=get_services_dict())
    processor = thrift_service.Processor(handler)
    transport = TSocket.TServerSocket(port=9090)
    tfactory = TTransport.TBufferedTransportFactory()
    pfactory = TBinaryProtocol.TBinaryProtocolFactory()

    server = TServer.TSimpleServer(processor, transport, tfactory, pfactory)
    return server

def main():
    server = taxon_service() # XXX: Run alternate ones
    print('Starting the server...')
    server.serve()
    print('done.')
    return 0

if __name__ == '__main__':
    sys.exit(main())