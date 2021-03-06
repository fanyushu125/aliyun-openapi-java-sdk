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

package com.aliyuncs.idrsservice.model.v20200630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idrsservice.transform.v20200630.ListAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalElements;

		private Integer totalPages;

		private List<ItemsItem> items;

		public Long getTotalElements() {
			return this.totalElements;
		}

		public void setTotalElements(Long totalElements) {
			this.totalElements = totalElements;
		}

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private String createdAt;

			private String departmentId;

			private String departmentName;

			private Boolean disabled;

			private String id;

			private String name;

			private String packageName;

			public String getCreatedAt() {
				return this.createdAt;
			}

			public void setCreatedAt(String createdAt) {
				this.createdAt = createdAt;
			}

			public String getDepartmentId() {
				return this.departmentId;
			}

			public void setDepartmentId(String departmentId) {
				this.departmentId = departmentId;
			}

			public String getDepartmentName() {
				return this.departmentName;
			}

			public void setDepartmentName(String departmentName) {
				this.departmentName = departmentName;
			}

			public Boolean getDisabled() {
				return this.disabled;
			}

			public void setDisabled(Boolean disabled) {
				this.disabled = disabled;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPackageName() {
				return this.packageName;
			}

			public void setPackageName(String packageName) {
				this.packageName = packageName;
			}
		}
	}

	@Override
	public ListAppsResponse getInstance(UnmarshallerContext context) {
		return	ListAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
