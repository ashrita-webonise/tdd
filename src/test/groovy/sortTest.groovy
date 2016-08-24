import spock.lang.Specification

/**
 * Created by webonise on 22/8/16.
 */
class sortTest extends Specification{

    def "Input array must not be empty" () {
        given:
        sortProg sorter = new sortProg()
        int[] array=[]

        when:
        sorter.sort(array)

        then:
        thrown Exception
    }

    def "Passing null paramerets" () {
        given:
        sortProg sorter = new sortProg()
        when:
        sorter.sort(null)

        then:
        thrown Exception

    }

    def "check for negative numbers"() {

        setup:
        sortProg sorter = new sortProg();
        int[] array = [-17,-3,-11]
        int[] Result=[-17,-11,-3]

        when:
        sorter.sort(array)

        then:
        array == Result
    }
    def "response for a singular array" () {

        setup:
        sortProg sorter = new sortProg();
        int[] array = [57]
        int[] result=[57]

        when:
        sorter.sort(array)

        then:
        array == result;
    }


    def "response for minimun sorting array" () {

        given:
        sortProg sorter = new sortProg();
        int[] array = [82,9]
        int [] result = [9,82]

        when:
        sorter.sort(array)

        then:
        array == result
    }

    def "check for more than one  same element"() {

        setup:
        sortProg sorter = new sortProg();
        int[] array = [47,47,47,47]
        //int[] Result = [47,47,47,47]

        when:
        sorter.sort(array)

        then:
        array == array //Result
    }

    def "response for a regular array"() {

        setup:
        sortProg sorter = new sortProg();
        int[] array = [268,144,89,3]
        int[] Result=[3,89,144,268]

        when:
        sorter.sort(array)

        then:
        array == Result
    }
}
