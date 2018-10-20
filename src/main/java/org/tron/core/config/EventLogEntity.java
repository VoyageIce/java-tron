package org.tron.core.config;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * MongoDB collection eventLog
 */
public class EventLogEntity implements Serializable {

    private static final long serialVersionUID = -70777625567836430L;

    private long blockNumber;

    private long blockTimestamp;

    private String contractAddress;

    private String entryName;

    private JSONObject resultJsonObject;

    private JSONObject rawJsonObject;

    private String transactionId;

    public EventLogEntity(long blockNumber, long blockTimestamp, String contractAddress, String entryName, JSONObject resultJsonObject, JSONObject rawJsonObject, String transactionId) {
        this.blockNumber = blockNumber;
        this.blockTimestamp = blockTimestamp;
        this.contractAddress = contractAddress;
        this.entryName = entryName;
        this.resultJsonObject = resultJsonObject;
        this.rawJsonObject = rawJsonObject;
        this.transactionId = transactionId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(long blockNumber) {
        this.blockNumber = blockNumber;
    }

    public long getBlockTimestamp() {
        return blockTimestamp;
    }

    public void setBlockTimestamp(long blockTimestamp) {
        this.blockTimestamp = blockTimestamp;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public JSONObject getResultJsonObject() {
        return resultJsonObject;
    }

    public void setResultJsonObject(JSONObject resultJsonObject) {
        this.resultJsonObject = resultJsonObject;
    }

    public JSONObject getRawJsonObject() {
        return rawJsonObject;
    }

    public void setRawJsonObject(JSONObject rawJsonObject) {
        this.rawJsonObject = rawJsonObject;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "EventLogEntity{" +
                "blockNumber=" + blockNumber +
                ", blockTimestamp=" + blockTimestamp +
                ", contractAddress='" + contractAddress + '\'' +
                ", entryName='" + entryName + '\'' +
                ", resultJsonObject=" + resultJsonObject +
                ", rawJsonObject=" + rawJsonObject +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
