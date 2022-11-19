package co.com.surenvios.librarycommon.dto.facture.response.common;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorFactureResponse implements Serializable {

	@JsonProperty(value = "maximumSeverityCode")
	private String maximumSeverityCode;

	@JsonProperty(value = "eventItems")
	private List<EventItem> eventItems;

	public String getMaximumSeverityCode() {
		return maximumSeverityCode;
	}

	public void setMaximumSeverityCode(String maximumSeverityCode) {
		this.maximumSeverityCode = maximumSeverityCode;
	}

	public List<EventItem> getEventItems() {
		return eventItems;
	}

	public void setEventItems(List<EventItem> eventItems) {
		this.eventItems = eventItems;
	}

	public class EventItem {

		@JsonProperty(value = "errorCode")
		private String errorCode;

		@JsonProperty(value = "severityCode")
		private String severityCode;

		@JsonProperty(value = "shortDescription")
		private String shortDescription;

		@JsonProperty(value = "detailDescription")
		private List<String> detailDescription;

		public String getErrorCode() {
			return errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getSeverityCode() {
			return severityCode;
		}

		public void setSeverityCode(String severityCode) {
			this.severityCode = severityCode;
		}

		public String getShortDescription() {
			return shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public List<String> getDetailDescription() {
			return detailDescription;
		}

		public void setDetailDescription(List<String> detailDescription) {
			this.detailDescription = detailDescription;
		}

	}
}
