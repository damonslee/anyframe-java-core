/*
 * Copyright 2008-2012 the original author or authors.
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
package org.anyframe.plugin.flex.query.attach.service;

import java.util.List;

import org.anyframe.plugin.flex.query.domain.Attached;

public interface UploadInfoService {
	
	public int create(List<Attached> attachedList) throws Exception;
	
	public int remove(List<Attached> attachedList) throws Exception;
	
	public List<Attached> getList(String refId) throws Exception;
}