package ru.feryafox.kavita4j.http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestOptions implements Cloneable {
    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> queryParams = new HashMap<>();

    public RequestOptions clone() {
        try {
            RequestOptions cloned = (RequestOptions) super.clone();
            cloned.headers = new HashMap<>(this.headers);
            cloned.queryParams = new HashMap<>(this.queryParams);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final RequestOptions requestOptions = new RequestOptions();

        public Builder addHeader(String key, String value) {
            requestOptions.headers.put(key, value);
            return this;
        }

        public Builder addQueryParam(String key, String value) {
            requestOptions.queryParams.put(key, value);
            return this;
        }

        public RequestOptions build() {
            return requestOptions;
        }
    }
}
