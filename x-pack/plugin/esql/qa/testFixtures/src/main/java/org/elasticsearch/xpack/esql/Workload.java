/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.esql;

import org.elasticsearch.xpack.esql.analysis.Analyzer;
import org.elasticsearch.xpack.esql.parser.EsqlParser;
import org.elasticsearch.xpack.ql.plan.logical.LogicalPlan;

public class Workload {
    public static void workload(Analyzer analyzer) throws Exception {
        EsqlParser parser = new EsqlParser();
        LogicalPlan plan = parser.createStatement("from users | enrich null");
        analyzer.analyze(plan);
    }
}
