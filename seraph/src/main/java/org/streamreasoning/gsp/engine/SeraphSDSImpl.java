package org.streamreasoning.gsp.engine; /**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.commons.rdf.api.IRI;
import org.neo4j.graphdb.GraphDatabaseService;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.rsp4j.api.sds.SDS;
import org.streamreasoning.rsp4j.api.sds.timevarying.TimeVarying;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final public class SeraphSDSImpl implements SDS<PGraph> {

    private static final int TO_STRING_MAX = 10;

    private GraphDatabaseService db;

    private List<TimeVarying<PGraph>> graphs = new ArrayList<>();

    public SeraphSDSImpl(GraphDatabaseService db) {
        this.db = db;
    }


    @Override
    public Collection<TimeVarying<PGraph>> asTimeVaryingEs() {
        return graphs;
    }

    @Override
    public void add(IRI iri, TimeVarying<PGraph> tvg) {

    }

    //add time varying graph to the sds (streaming data set)
    @Override
    public void add(TimeVarying<PGraph> tvg) {
        graphs.add(tvg);
    }

    @Override
    public SDS<PGraph> materialize(long ts) {
        return SDS.super.materialize(ts);
    }
}
