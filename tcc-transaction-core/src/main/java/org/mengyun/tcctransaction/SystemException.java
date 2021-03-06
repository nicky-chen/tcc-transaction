package org.mengyun.tcctransaction;

/**
 * 系统异常
 *
 * Created by changming.xie on 6/1/16.
 */
public class SystemException extends RuntimeException {

    public SystemException(String message) {
        super(message);
    }

    public SystemException(Throwable e) {
        super(e);
    }

    public SystemException(String message, Throwable e) {
        super(message, e);
    }
}
