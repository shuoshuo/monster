package com.le.jr.trade.configure.service;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * <p>DESCRIPTION:  兑付申请单的测试类
 * <p>CALLED BY:	钱明金
 * <p>CREATE DATE: 2016/4/4
 *
 * @version 1.0
 * @since java 1.7.0
 */
@ContextConfiguration(locations = {"classpath:spring-config*.xml"})
@ActiveProfiles("test")
public class SpringContextTestCase extends AbstractJUnit4SpringContextTests {
}
