/*
 * Copyright (c) [2016] [ <ether.camp> ]
 * This file is part of the ethereumJ library.
 *
 * The ethereumJ library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The ethereumJ library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the ethereumJ library. If not, see <http://www.gnu.org/licenses/>.
 */
package org.tron.core.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "org.tron")
public class CommonConfig {

    private static final Logger logger = LoggerFactory.getLogger("general");

    private static CommonConfig defaultInstance;

    public static String privateKey = "0f35c46e5eef8e8b795a2506bb3bfbd2b60a32f189256070f4c50fef91d752f3";
    public static String publicAddress = "TXPS5n2gtdL7E6SQB9V7Q64y5pmNg3yH4e";
    public static String contractAddressBase58 = "TDVJZ53EowTzWnyknSeDqRGSJjoibExZWh";
    public static String methodStr = "rollDice(uint256)";
    public static int _point = 50;
}
