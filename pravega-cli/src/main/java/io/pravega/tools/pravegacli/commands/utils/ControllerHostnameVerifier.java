/**
 * Copyright (c) 2017 Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.pravega.tools.pravegacli.commands.utils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class ControllerHostnameVerifier implements HostnameVerifier {
    @Override
    public boolean verify(String s, SSLSession sslSession) {
        return s.equalsIgnoreCase(sslSession.getPeerHost());
    }
}
