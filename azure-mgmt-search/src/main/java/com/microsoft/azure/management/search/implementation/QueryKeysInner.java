/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in QueryKeys.
 */
public final class QueryKeysInner {
    /** The Retrofit service to perform REST calls. */
    private QueryKeysService service;
    /** The service client containing this operation class. */
    private SearchManagementClientImpl client;

    /**
     * Initializes an instance of QueryKeysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public QueryKeysInner(Retrofit retrofit, SearchManagementClientImpl client) {
        this.service = retrofit.create(QueryKeysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for QueryKeys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface QueryKeysService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Search/searchServices/{serviceName}/listQueryKeys")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns the list of query API keys for the given Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription.
     * @param serviceName The name of the Search service for which to list query keys.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ListQueryKeysResultInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ListQueryKeysResultInner> list(String resourceGroupName, String serviceName) throws CloudException, IOException, IllegalArgumentException {
        return listAsync(resourceGroupName, serviceName).toBlocking().single();
    }

    /**
     * Returns the list of query API keys for the given Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription.
     * @param serviceName The name of the Search service for which to list query keys.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ListQueryKeysResultInner> listAsync(String resourceGroupName, String serviceName, final ServiceCallback<ListQueryKeysResultInner> serviceCallback) {
        return ServiceCall.create(listAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Returns the list of query API keys for the given Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription.
     * @param serviceName The name of the Search service for which to list query keys.
     * @return the observable to the ListQueryKeysResultInner object
     */
    public Observable<ServiceResponse<ListQueryKeysResultInner>> listAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, serviceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ListQueryKeysResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ListQueryKeysResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ListQueryKeysResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ListQueryKeysResultInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ListQueryKeysResultInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ListQueryKeysResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
