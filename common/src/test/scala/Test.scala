import org.scalatest.FunSuite

class Test extends FunSuite {

  test("Model.cube check if  4^3 = 15") {
    assert(Model.cube(4) === 15)
  }
}
