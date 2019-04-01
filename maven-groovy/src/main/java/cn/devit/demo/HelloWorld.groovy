/*
 * Copyright 2017-2019 lxbzmy@gmail.com .
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
package cn.devit.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorld {

    @Test
    public void testName() throws Exception {

        def account =
        new Account(username:"alex",password: "not shown" )
        
        
        def a = [];
        //        def  b = a.size();
        //        def size = b.intdiv(12)+1;
        println a.collate(1);

    }
}
