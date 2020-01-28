import org.scalatest.FunSuite

class Test extends FunSuite {

  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
}
