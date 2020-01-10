/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.storageimportexport.v2016_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storageimportexport.v2016_11_01.Locations;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.storageimportexport.v2016_11_01.Location;

class LocationsImpl extends WrapperImpl<LocationsInner> implements Locations {
    private final StorageImportExportManager manager;

    LocationsImpl(StorageImportExportManager manager) {
        super(manager.inner().locations());
        this.manager = manager;
    }

    public StorageImportExportManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Location> getAsync(String locationName) {
        LocationsInner client = this.inner();
        return client.getAsync(locationName)
        .map(new Func1<LocationInner, Location>() {
            @Override
            public Location call(LocationInner inner) {
                return new LocationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Location> listAsync() {
        LocationsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<List<LocationInner>, Observable<LocationInner>>() {
            @Override
            public Observable<LocationInner> call(List<LocationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<LocationInner, Location>() {
            @Override
            public Location call(LocationInner inner) {
                return new LocationImpl(inner, manager());
            }
        });
    }

}