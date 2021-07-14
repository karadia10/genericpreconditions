package com.karadia10;

import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/**
 * This class contains utility methods for checking CDM preconditions
 */
public final class GenericPreconditions {

    private GenericPreconditions() throws InstantiationException {
        throw new InstantiationException("Cannot Instantiate GenericPreconditions");
    }

    /**
     * Checks if collection is Empty
     *
     * @param collection content of collection
     * @param <T>        Generic type
     * @return returns true when collection is empty
     */
    public static <T> boolean isEmpty(Collection<T> collection) {
        return (Objects.isNull(collection) || collection.isEmpty());
    }

    /**
     * Checks if Map is Empty
     *
     * @param map content of the map
     * @param <T> Generic type of Key
     * @param <U> Generic type of value
     * @return returns true when map is empty
     */
    public static <T, U> boolean isEmpty(Map<T, U> map) {
        return (Objects.isNull(map) || map.isEmpty());
    }

    /**
     * Checks if Properties is Empty
     *
     * @param properties content of properties
     * @return returns true when properties is empty
     */
    public static boolean isEmpty(Properties properties) {
        return (Objects.isNull(properties) || properties.isEmpty());
    }

    /**
     * Checks if array is empty
     *
     * @param array content of array
     * @param <T>   Generic type of array
     * @return returns true when array is empty
     */
    public static <T> boolean isEmpty(T[] array) {
        return (Objects.isNull(array) || array.length == 0);
    }

    /**
     * Checks if String is Empty
     *
     * @param string content of string
     * @return returns true when string is empty
     */
    public static boolean isEmpty(String string) {
        return (StringUtils.isBlank(string));
    }

    /**
     * Checks if Collection is not Empty
     *
     * @param collection content of collection
     * @param <T>        generic type of collection
     * @return returns true when collection is not empty
     */
    public static <T> boolean isNotEmpty(Collection<T> collection) {
        return !isEmpty(collection);
    }

    /**
     * Checks if Map is not empty
     *
     * @param map content of map
     * @param <T> Generic type of Key
     * @param <U> Generic type of value
     * @return returns true when map is not empty
     */
    public static <T, U> boolean isNotEmpty(Map<T, U> map) {
        return !isEmpty(map);
    }

    /**
     * Checks if Properties is not Empty
     *
     * @param properties content of properties
     * @return returns true when properties is not empty
     */
    public static boolean isNotEmpty(Properties properties) {
        return !isEmpty(properties);
    }

    /**
     * Checks if Array is not Empty
     *
     * @param array content of array
     * @param <T>   Generic type of array
     * @return returns true when array is not empty
     */
    public static <T> boolean isNotEmpty(T[] array) {
        return !isEmpty(array);
    }

    /**
     * Checks if String is not Empty
     *
     * @param string content of string
     * @return returns true when string is not empty
     */
    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }

}
