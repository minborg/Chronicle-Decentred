package net.openhft.chronicle.decentred.api;

import net.openhft.chronicle.bytes.MethodId;
import net.openhft.chronicle.decentred.dto.CreateChainRequest;
import net.openhft.chronicle.decentred.dto.CreateTokenRequest;

public interface SystemMessages extends
        WeeklyEvents,
        AccountManagementRequests,
        SystemMessageListener {
    @MethodId(0x0101)
    void createChainRequest(CreateChainRequest createChainRequest);

    @MethodId(0x0102)
    void createTokenRequest(CreateTokenRequest createTokenRequest);
}
