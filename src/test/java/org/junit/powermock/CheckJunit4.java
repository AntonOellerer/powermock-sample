package org.junit.powermock;

import com.chargebee.Result;
import com.chargebee.internal.Request;
import com.chargebee.org.json.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.modules.junit4.rule.PowerMockRule;

import static org.junit.Assert.assertNotNull;

public class CheckJunit4 {

    @Rule
    public PowerMockRule rule = new PowerMockRule();

    @Test
    public void subscriptionDeletedEvent() throws Exception {
        Request mockedRequest = Mockito.mock(Request.class);
        Mockito.when(mockedRequest.request()).thenReturn(new Result(200, new JSONObject("{" + "\"event\": {" + "\"event_type\": \"subscription_deleted\"," + "\"content\": {" + "\"customer\": {" + "\"id\": \"" + "12344" + "\"," + "}," + "}" + "}" + "}")));
        assertNotNull(mockedRequest.request());
    }

}
