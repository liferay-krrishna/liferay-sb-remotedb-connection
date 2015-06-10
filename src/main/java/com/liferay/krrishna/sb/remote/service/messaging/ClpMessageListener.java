package com.liferay.krrishna.sb.remote.service.messaging;

import com.liferay.krrishna.sb.remote.service.ClpSerializer;
import com.liferay.krrishna.sb.remote.service.MyCustomCountryLocalServiceUtil;
import com.liferay.krrishna.sb.remote.service.MyCustomCountryServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            MyCustomCountryLocalServiceUtil.clearService();

            MyCustomCountryServiceUtil.clearService();
        }
    }
}
