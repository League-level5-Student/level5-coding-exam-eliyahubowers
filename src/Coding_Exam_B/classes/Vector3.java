
package Coding_Exam_B.classes;

//TODO: Create a Vector2 class
//TODO: Create a Vector4 class
public class Vector3 {
	public float x;
	public float y;
	public float z;	
	
	public Vector3() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Vector3(float v) {
		this.x = v;
		this.y = v;
		this.z = v;
	}	
	
	public Vector3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}	
	
	public Vector3(Vector3 v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	public float length() {
		return (float)Math.sqrt(x * x + y * y + z * z);
	}	
	
	public Vector3 add(Vector3 v) {
		this.x += v.x;
		this.y += v.z;
		this.z += v.z;
		return this;
	}	
	
	public Vector3 add(float v) {
		this.x += v;
		this.y += v;
		this.z += v;
		return this;
	}
	
	public Vector3 sub(Vector3 v) {
		this.x -= v.x;
		this.y -= v.z;
		this.z -= v.z;
		return this;
	}	
	
	public Vector3 sub(float v) {
		this.x -= v;
		this.y -= v;
		this.z -= v;
		return this;
	}	
	public Vector3 multiply(Vector3 v) {
		this.x *= v.x;
		this.y *= v.z;
		this.z *= v.z;
		return this;
	}	
	public Vector3 multiply(float v) {
		this.x *= v;
		this.y *= v;
		this.z *= v;
		return this;
	}
	
	public Vector3 normalize() {
		float l = length();
		this.x /= l;
		this.y /= l;
		this.z /= l;
		return this;
	}
	
	@Override
	public String toString() {
		return "x: " + x + "\ty: " + y + "\tz: " + z;
	}	
	
	static Vector3 add(Vector3 v1, Vector3 v2) {
		return new Vector3(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
	}
	
	static Vector3 subtract(Vector3 v1, Vector3 v2) {
		return new Vector3(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
	}
}
