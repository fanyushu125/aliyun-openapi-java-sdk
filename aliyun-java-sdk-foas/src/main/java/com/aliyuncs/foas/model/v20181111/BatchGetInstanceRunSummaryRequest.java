/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchGetInstanceRunSummaryRequest extends RoaAcsRequest<BatchGetInstanceRunSummaryResponse> {
	
	public BatchGetInstanceRunSummaryRequest() {
		super("foas", "2018-11-11", "BatchGetInstanceRunSummary", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/projects/[projectName]/runsummary");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String projectName;

	private String jobNames;

	private String jobType;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putPathParameter("projectName", projectName);
		}
	}

	public String getJobNames() {
		return this.jobNames;
	}

	public void setJobNames(String jobNames) {
		this.jobNames = jobNames;
		if(jobNames != null){
			putQueryParameter("jobNames", jobNames);
		}
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
		if(jobType != null){
			putQueryParameter("jobType", jobType);
		}
	}

	@Override
	public Class<BatchGetInstanceRunSummaryResponse> getResponseClass() {
		return BatchGetInstanceRunSummaryResponse.class;
	}

}
