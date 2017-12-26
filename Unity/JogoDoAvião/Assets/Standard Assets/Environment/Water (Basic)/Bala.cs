using UnityEngine;
using System.Collections;

public class Bala : MonoBehaviour {

	public Rigidbody rb;
	// Use this for initialization
	void Start () {
		rb = transform.GetComponent<Rigidbody> ();
	}
	void OnTriggerEnter(Collider outro){
		if (outro.gameObject.tag == "Meteoro") {
			Destroy (gameObject);
			Aviao.pontos = Aviao.pontos + 20;
		}
	}
	// Update is called once per frame
	void Update () {
		rb.velocity = transform.up * 15;
		Destroy (gameObject, 7);
	}
}
