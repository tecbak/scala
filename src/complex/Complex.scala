package complex

class Complex(val real: Double, val image: Double) extends Ordered[Complex] {
  def magnitude: Double = Math.sqrt(real * real + image * image)

  def angle: Double = Math.atan2(image, real)

  def +(that: Complex) = new Complex(this.real + that.real, this.image + that.image)

  override def compare(that: Complex): Int = this.magnitude compare that.magnitude

  override def toString: String = real + " + i*" + image + " | " + magnitude + "*e^(i*" + angle + "))"
}

