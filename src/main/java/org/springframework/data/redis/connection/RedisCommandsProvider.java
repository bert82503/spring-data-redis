/*
 * Copyright 2022-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.redis.connection;

/**
 * Provides access to {@link RedisCommands} and the segregated command interfaces.
 * Redis命令集提供者，提供对Redis命令集和隔离命令接口的访问。
 *
 * @author Mark Paluch
 * @since 3.0
 */
public interface RedisCommandsProvider {

	/**
	 * Get {@link RedisCommands}.
	 * 所有命令
	 *
	 * @return never {@literal null}.
	 * @since 3.0
	 */
	RedisCommands commands();

	/**
	 * Get {@link RedisGeoCommands}.
	 * 地理命令
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisGeoCommands geoCommands();

	/**
	 * Get {@link RedisHashCommands}.
	 * 哈希命令
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisHashCommands hashCommands();

	/**
	 * Get {@link RedisHyperLogLogCommands}.
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisHyperLogLogCommands hyperLogLogCommands();

	/**
	 * Get {@link RedisKeyCommands}.
	 * 键命令
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisKeyCommands keyCommands();

	/**
	 * Get {@link RedisListCommands}.
	 * 列表命令
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisListCommands listCommands();

	/**
	 * Get {@link RedisSetCommands}.
	 * 集合命令
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisSetCommands setCommands();

	/**
	 * Get {@link RedisScriptingCommands}.
	 * 脚本命令
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisScriptingCommands scriptingCommands();

	/**
	 * Get {@link RedisServerCommands}.
	 * 服务器命令
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisServerCommands serverCommands();

	/**
	 * Get {@link RedisStreamCommands}.
	 * 数据流命令
	 *
	 * @return never {@literal null}.
	 * @since 2.2
	 */
	RedisStreamCommands streamCommands();

	/**
	 * Get {@link RedisStringCommands}.
	 * 字符串命令
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisStringCommands stringCommands();

	/**
	 * Get {@link RedisZSetCommands}.
	 * 有序集合命令
	 *
	 * @return never {@literal null}.
	 * @since 2.0
	 */
	RedisZSetCommands zSetCommands();
}
