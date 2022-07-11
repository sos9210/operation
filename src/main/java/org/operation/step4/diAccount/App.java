package org.operation.step4.diAccount;

import org.operation.step4.Book;
import org.operation.step4.MyBook;
import org.operation.step4.di.ContainerService;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        AccountService accountService = ContainerService.getObject(AccountService.class);
        accountService.join();
    }
}
