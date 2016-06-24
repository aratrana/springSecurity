/*
 *  Created on Sep 18, 2008 by Alan Feng
 *
 *  This document set is the property of GTECH Corporation, West Greenwich,
 *  Rhode Island, and contains confidential and trade secret information.
 *  It cannot be transferred from the custody or control of GTECH except as
 *  authorized in writing by an officer of GTECH. Neither this item nor
 *  the information it contains can be used, transferred, reproduced, published,
 *  or disclosed, in whole or in part, directly or indirectly, except as
 *  expressly authorized by an officer of GTECH, pursuant to written agreement.
 *
 *  Copyright 2005 GTECH Corporation. All Rights Reserved.
 */
package com.arat.budget.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * A helper class to make the spring context loaded via the web ContextLoaderListener accessible
 * outside of the servlet context.
 * 
 * To use this class, add a entry to declare this bean in the Spring context configuration file.
 * That context will then be automatically added to this class.
 * 
 * It can be further enhanced later to track multiple contexts using ID and probably used to
 * maintain a tree structure of parent-child context relationship.
 * 
 * @author Alan Feng
 */
public class SpringContextHelper implements ApplicationContextAware {
    private static ApplicationContext ctx;

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
     */
    public void setApplicationContext(ApplicationContext appCtx) {
        ctx = appCtx;
    }

    /**
     * Return the ApplicationContext created from the bean configuration file that declares this
     * bean class.
     * 
     * @return
     */
    public static ApplicationContext getContext() {
        return ctx;
    }
}