package b

import a.A

/**
 * Created by Rodrigo Quesada on 22/09/15.
 */
class B : A() {

    fun doSomething() {
        A.C()
    }
}