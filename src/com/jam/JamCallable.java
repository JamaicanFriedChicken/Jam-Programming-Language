package com.jam;

import java.util.List;

interface JamCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
