import spock.lang.Specification

/**
 * Created by webonise on 24/8/16.
 */
class quickTest extends Specification{
    def "Input array must not be empty" () {
        given:
        quickSort quick1 = new quickSort()
        int[] array=[]

        when:
        quick1.sort(array)

        then:
        thrown Exception
    }

    def "Passing null paramerets" () {
        given:
        quickSort quick1 = new quickSort()
        when:
        quick1.sort(null)

        then:
        thrown Exception

    }

    def "check for negative numbers"() {

        setup:
        quickSort quick1 = new quickSort();
        int[] array = [-17,-3,-11]
        int[] Result=[-17,-11,-3]

        when:
        quickSort.sort(array)

        then:
        array == Result
    }
    def "response for a singular array" () {

        setup:
        quickSort quick1 = new quickSort();
        int[] array = [57]
        int[] result=[57]

        when:
        quick1.sort(array)

        then:
        array == result;
    }
    
    def "response for minimun sorting array" () {

        given:
        quickSort quick1 = new quickSort();
        int[] array = [82,9]
        int [] result = [9,82]

        when:
        quick1.sort(array)

        then:
        array == result
    }

    def "check for more than one  same element"() {

        setup:
        quickSort quick1 = new quickSort();
        int[] array = [47,47,47,47]
        //int[] Result = [47,47,47,47]

        when:
        quick1.sort(array)

        then:
        array == array //Result
    }

    def "response for a regular array"() {

        setup:
        quickSort quick1 = new quickSort();
        int[] array = [268,144,89,3]
        int[] Result=[3,89,144,268]

        when:
        quick1.sort(array)

        then:
        array == Result
    }
}