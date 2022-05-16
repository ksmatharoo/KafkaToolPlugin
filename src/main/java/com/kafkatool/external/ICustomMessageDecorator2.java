package com.kafkatool.external;

import java.util.Map;

public interface ICustomMessageDecorator2 {
    public String getDisplayName();
    public String decorate(String zookeeperHost, String brokerHost, String topic,
                           long partitionId, long offset, byte[] msg,
                           Map<String, byte[]> headers, Map<String, String> reserved);
}
