/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.esql;

import org.elasticsearch.xpack.esql.parser.EsqlParser;

public class Workload {
    public static void workload() throws Exception {
        EsqlParser parser = new EsqlParser();
        String query = "from index_path | where a like \"c:\\*\"";
        parser.createStatement(query);
    }
}
