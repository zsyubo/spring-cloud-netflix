/*
 * Copyright 2013-2020 the original author or authors.
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

package org.springframework.cloud.netflix.eureka.server;

import java.util.Collection;
import java.util.LinkedHashSet;

import com.sun.jersey.api.client.filter.ClientFilter;

/**
 * 复制客户端附加过滤器
 * @author Yuxin Bai
 */
public class ReplicationClientAdditionalFilters {

	private Collection<ClientFilter> filters;

	public ReplicationClientAdditionalFilters(Collection<ClientFilter> filters) {
		this.filters = new LinkedHashSet<>(filters);
	}

	public Collection<ClientFilter> getFilters() {
		return this.filters;
	}

}
