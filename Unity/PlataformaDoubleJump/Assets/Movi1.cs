using UnityEngine;
using System.Collections;
using UnityEngine.SceneManagement;

public class Movi1 : MonoBehaviour {
	Rigidbody rb;
	void Start () {
		rb = GetComponent<Rigidbody> ();
	}
	// Update is called once per frame
	void Update () {
		
		if (transform.position.x < -17f) {
			transform.position = new Vector3(-17f, transform.position.y, transform.position.z);
		}
		if (transform.position.y > 2.59f) {
			transform.position = new Vector3(transform.position.x, 2.59f, transform.position.z);
		}
		if (transform.position.y < -7.65f) {
			Destroy(gameObject);
			SceneManager.LoadScene ("Morte");
		}
		if (Input.GetKeyDown (KeyCode.Space)) {
			rb.AddForce(0,200,0);
		}
		if(Input.GetKey(KeyCode.LeftArrow)){
			transform.Translate(-(Time.deltaTime * 5), 0, 0);
		}
		if(Input.GetKey(KeyCode.RightArrow)){
			transform.Translate((Time.deltaTime * 5), 0, 0);
		}
	}
}
