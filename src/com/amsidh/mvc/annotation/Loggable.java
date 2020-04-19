/**
 * 
 */
package com.amsidh.mvc.annotation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({ METHOD, CONSTRUCTOR })
/**
 * @author amsidhlokhande
 *
 */
public @interface Loggable {

}
