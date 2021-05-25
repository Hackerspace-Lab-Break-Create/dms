package org.hackerspace.lbc.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RegisterDeviceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-25T11:28:05.678Z[Atlantic/Azores]")
public class RegisterDeviceRequest   {
  @JsonProperty("deviceId")
  private String deviceId;

  public RegisterDeviceRequest deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * The unique ID of the device being registered.
   * @return deviceId
  */
  @ApiModelProperty(example = "[\"UniqueBatata\",\"f84430a8-7372-4322-b69e-6423882545e3\"]", required = true, value = "The unique ID of the device being registered.")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterDeviceRequest registerDeviceRequest = (RegisterDeviceRequest) o;
    return Objects.equals(this.deviceId, registerDeviceRequest.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterDeviceRequest {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

