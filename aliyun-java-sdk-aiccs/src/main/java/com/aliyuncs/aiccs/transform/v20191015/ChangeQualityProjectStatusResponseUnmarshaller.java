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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.ChangeQualityProjectStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeQualityProjectStatusResponseUnmarshaller {

	public static ChangeQualityProjectStatusResponse unmarshall(ChangeQualityProjectStatusResponse changeQualityProjectStatusResponse, UnmarshallerContext _ctx) {
		
		changeQualityProjectStatusResponse.setRequestId(_ctx.stringValue("ChangeQualityProjectStatusResponse.RequestId"));
		changeQualityProjectStatusResponse.setCode(_ctx.stringValue("ChangeQualityProjectStatusResponse.Code"));
		changeQualityProjectStatusResponse.setMessage(_ctx.stringValue("ChangeQualityProjectStatusResponse.Message"));
		changeQualityProjectStatusResponse.setSuccess(_ctx.booleanValue("ChangeQualityProjectStatusResponse.Success"));
		changeQualityProjectStatusResponse.setData(_ctx.stringValue("ChangeQualityProjectStatusResponse.Data"));
	 
	 	return changeQualityProjectStatusResponse;
	}
}