/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel;

import com.alibaba.csp.sentinel.init.InitExecutor;
import com.alibaba.csp.sentinel.node.DefaultNodeBuilder;
import com.alibaba.csp.sentinel.node.NodeBuilder;
import com.alibaba.csp.sentinel.slots.DefaultSlotsChainBuilder;
import com.alibaba.csp.sentinel.slots.SlotsChainBuilder;

/**
 * @author jialiang.linjl
 */
public class Env {

    public static final SlotsChainBuilder slotsChainbuilder = new DefaultSlotsChainBuilder();
    public static final NodeBuilder nodeBuilder = new DefaultNodeBuilder();
    public static final Sph sph = new CtSph();

    static {
        // If init fails, the process will exit.
        InitExecutor.doInit();
    }

}
