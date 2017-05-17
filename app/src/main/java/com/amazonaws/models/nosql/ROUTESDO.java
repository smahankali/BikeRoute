package com.amazonaws.models.nosql;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@DynamoDBTable(tableName = "blindbike-mobilehub-483493970-ROUTES")

public class ROUTESDO {
    private String _userId;
    private String _routeId;
    private String _category;
    private String _endLatitude;
    private String _endLongitude;
    private String _name;
    private Double _numberTraveled;
    private String _startLatitude;
    private String _startLongitude;

    @DynamoDBHashKey(attributeName = "userId")
    @DynamoDBAttribute(attributeName = "userId")
    public String getUserId() {
        return _userId;
    }

    public void setUserId(final String _userId) {
        this._userId = _userId;
    }
    @DynamoDBRangeKey(attributeName = "routeId")
    @DynamoDBAttribute(attributeName = "routeId")
    public String getRouteId() {
        return _routeId;
    }

    public void setRouteId(final String _routeId) {
        this._routeId = _routeId;
    }
    @DynamoDBIndexHashKey(attributeName = "category", globalSecondaryIndexName = "Categories")
    public String getCategory() {
        return _category;
    }

    public void setCategory(final String _category) {
        this._category = _category;
    }
    @DynamoDBAttribute(attributeName = "end_latitude")
    public String getEndLatitude() {
        return _endLatitude;
    }

    public void setEndLatitude(final String _endLatitude) {
        this._endLatitude = _endLatitude;
    }
    @DynamoDBAttribute(attributeName = "end_longitude")
    public String getEndLongitude() {
        return _endLongitude;
    }

    public void setEndLongitude(final String _endLongitude) {
        this._endLongitude = _endLongitude;
    }
    @DynamoDBIndexHashKey(attributeName = "name", globalSecondaryIndexName = "Names")
    public String getName() {
        return _name;
    }

    public void setName(final String _name) {
        this._name = _name;
    }
    @DynamoDBIndexHashKey(attributeName = "number_traveled", globalSecondaryIndexName = "Popular")
    public Double getNumberTraveled() {
        return _numberTraveled;
    }

    public void setNumberTraveled(final Double _numberTraveled) {
        this._numberTraveled = _numberTraveled;
    }
    @DynamoDBAttribute(attributeName = "start_latitude")
    public String getStartLatitude() {
        return _startLatitude;
    }

    public void setStartLatitude(final String _startLatitude) {
        this._startLatitude = _startLatitude;
    }
    @DynamoDBAttribute(attributeName = "start_longitude")
    public String getStartLongitude() {
        return _startLongitude;
    }

    public void setStartLongitude(final String _startLongitude) {
        this._startLongitude = _startLongitude;
    }

}
