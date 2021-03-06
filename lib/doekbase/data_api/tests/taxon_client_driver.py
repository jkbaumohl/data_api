# Stdlib
import argparse
import os
import sys
import time

# Third-party

# Local
from doekbase.data_api.taxonomy.taxon.api import TaxonClientAPI

def test_client():
    ap = argparse.ArgumentParser()
    ap.add_argument('--ref', default='ReferenceTaxons/83333_taxon', help='Object reference ID, e.g. 1019/4/1')
    ap.add_argument('--host', dest='host', default='localhost',
                    metavar='ADDR', help='Remote server host '
                                         '(default=%(default)s)')
    ap.add_argument('--port', dest='port', default=9090,
                    metavar='PORT', help='Remote server port '
                                         '(default=%(default)d)')
    args = ap.parse_args()

    api = TaxonClientAPI(args.host, args.port, os.environ["KB_AUTH_TOKEN"], args.ref)

    print("Getting data..")

    t0 = time.time()
    genetic_code = api.get_genetic_code()
    dt = time.time() - t0
    print genetic_code
    print("Got and parsed data in {:g} seconds".format(dt))

    t0 = time.time()
    aliases = api.get_aliases()
    dt = time.time() - t0
    print aliases
    print("Got and parsed data in {:g} seconds".format(dt))

    t0 = time.time()
    domain = api.get_domain()
    dt = time.time() - t0
    print domain
    print("Got and parsed data in {:g} seconds".format(dt))

    try:
        t0 = time.time()
        kingdom = api.get_kingdom()
        dt = time.time() - t0
        print kingdom
        print("Got and parsed data in {:g} seconds".format(dt))
    except:
        pass

    t0 = time.time()
    taxonomic_id = api.get_taxonomic_id()
    dt = time.time() - t0
    print taxonomic_id
    print("Got and parsed data in {:g} seconds".format(dt))

    t0 = time.time()
    scientific_lineage = api.get_scientific_lineage()
    dt = time.time() - t0
    print scientific_lineage
    print("Got and parsed data in {:g} seconds".format(dt))

    t0 = time.time()
    genome_annotations = api.get_genome_annotations()
    dt = time.time() - t0
    print genome_annotations
    print("Got and parsed data in {:g} seconds".format(dt))

    t0 = time.time()
    parent = api.get_parent()
    dt = time.time() - t0
    print parent
    print("Got and parsed data in {:g} seconds".format(dt))

    t0 = time.time()
    children = api.get_children()
    dt = time.time() - t0
    print children
    print("Got and parsed data in {:g} seconds".format(dt))


if __name__ == '__main__':
    test_client() # XXX: choose one with top-level args
    sys.exit(0)