package com.amazonaws.mobile.api;
//
// Copyright 2016 Amazon.com, Inc. or its affiliates (Amazon). All Rights Reserved.
//
// Code generated by AWS Mobile Hub. Amazon gives unlimited permission to 
// copy, distribute and modify it.
//
// Source code generated from template: aws-my-sample-app-android v0.10
//

import android.util.Log;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobile.AWSMobileClient;
import com.amazonaws.mobile.user.IdentityManager;
import com.amazonaws.mobileconnectors.apigateway.ApiClientFactory;
import com.amazonaws.mobileconnectors.apigateway.ApiRequest;
import com.amazonaws.mobileconnectors.apigateway.ApiResponse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * Represents the configuration for a single API endpoint in Amazon API Gateway.
 */
public class CloudLogicAPIConfiguration {

    private static final String LOG_TAG = CloudLogicAPIConfiguration.class.getSimpleName();

    private String displayName;
    private String description;
    private String endpoint;
    private String[] paths;
    private Class<?> clientClass;

    /**
     * Constructor.
     * @param displayName display name
     * @param description description
     * @param endpoint endpoint
     * @param paths resource paths
     * @param clientClass client class
     */
    public CloudLogicAPIConfiguration(final String displayName,
                                      final String description,
                                      final String endpoint,
                                      final String[] paths,
                                      final Class<?> clientClass) {
        this.displayName = displayName;
        this.description = description;
        this.endpoint = endpoint;
        this.paths = paths;
        this.clientClass = clientClass;
    }

    /**
     * Gets the display name.
     * @return display name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Gets the description.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the endpoint.
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Gets the paths.
     * @return paths
     */
    public String[] getPaths() {
        return paths;
    }

    /**
     * Gets the Amazon API Gateway client class.
     * @return client class
     */
    public Class<?> getClientClass() {
        return clientClass;
    }

    /**
     * Gets an instance of the client class.
     * @return client
     */
    public CloudLogicAPI getClient() {
        final AWSMobileClient mobileClient = AWSMobileClient.defaultMobileClient();
        final IdentityManager identityManager = mobileClient.getIdentityManager();
        final AWSCredentialsProvider credentialsProvider = identityManager.getCredentialsProvider();

        final Object actualClient =
                new ApiClientFactory().
                        credentialsProvider(credentialsProvider).
                        build(clientClass);

        // This is only required so we can treat all client instances generically for demo
        // purposes, since they have no common base class.
        final CloudLogicAPI wrapperClient = new CloudLogicAPI() {
            @Override
            public ApiResponse execute(final ApiRequest request) {

                try {
                    final Method method =
                            clientClass.getDeclaredMethod("execute", new Class[]{ApiRequest.class});
                    return (ApiResponse)method.invoke(actualClient, request);
                } catch (final InvocationTargetException ite) {
                    Log.e(LOG_TAG, "API invocation failed.", ite);
                    ite.printStackTrace();
                    if (ite.getCause() != null && ite.getCause() instanceof UndeclaredThrowableException) {
                        throw new RuntimeException(ite.getCause().getCause());
                    }

                    throw new RuntimeException(ite.getCause());
                } catch (final NoSuchMethodException nse) {
                    Log.e(LOG_TAG, "Unable to invoke wrapped client.", nse);
                    nse.printStackTrace();
                    throw new RuntimeException("Unable to invoke wrapped client.", nse);
                } catch (final IllegalAccessException iae) {
                    Log.e(LOG_TAG, "Unable to invoke wrapped client.", iae);
                    iae.printStackTrace();
                    throw new RuntimeException("Unable to invoke wrapped client.", iae);
                }
            }

            @Override
            public Object getAPIClient() {
                return actualClient;
            }
        };

        return wrapperClient;
    }
}
