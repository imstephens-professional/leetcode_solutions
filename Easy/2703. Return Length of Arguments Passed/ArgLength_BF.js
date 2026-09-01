/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 * 40 ms - beats 72.13%
 * 54.04 mb - beats 15.07%
 */
var argumentsLength = function(...args) {
    return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */
