package org.tron.common.logsfilter;

import org.pf4j.ExtensionPoint;

public interface IPluginEventListener extends ExtensionPoint {
    public void setServerAddress(String address);

    public void setTopic(int eventType, String topic);

    public void handleBlockEvent(Object trigger);

    public void handleTransactionTrigger(Object trigger);

    public void handleContractLogTrigger(Object trigger);

    public void handleContractEventTrigger(Object trigger);

}
