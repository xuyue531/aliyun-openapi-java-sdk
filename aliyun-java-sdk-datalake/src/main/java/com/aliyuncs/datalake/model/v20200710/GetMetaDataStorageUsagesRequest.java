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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datalake.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMetaDataStorageUsagesRequest extends RoaAcsRequest<GetMetaDataStorageUsagesResponse> {
	   

	private String months;
	public GetMetaDataStorageUsagesRequest() {
		super("DataLake", "2020-07-10", "GetMetaDataStorageUsages");
		setUriPattern("/webapi/measure/getMetaDataStorageUsages");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMonths() {
		return this.months;
	}

	public void setMonths(String months) {
		this.months = months;
		if(months != null){
			putQueryParameter("Months", months);
		}
	}

	@Override
	public Class<GetMetaDataStorageUsagesResponse> getResponseClass() {
		return GetMetaDataStorageUsagesResponse.class;
	}

}
