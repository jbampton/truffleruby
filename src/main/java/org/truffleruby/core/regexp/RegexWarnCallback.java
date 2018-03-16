/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.truffleruby.core.regexp;

import org.joni.WarnCallback;
import org.truffleruby.RubyContext;
import org.truffleruby.launcher.RubyLogger;

public class RegexWarnCallback implements WarnCallback {

    private final RubyContext context;

    public RegexWarnCallback(RubyContext context) {
        this.context = context;
    }

    @Override
    public void warn(String message) {
        if (context.getCoreLibrary().isVerbose()) {
            RubyLogger.LOGGER.warning(message);
        }
    }

}
