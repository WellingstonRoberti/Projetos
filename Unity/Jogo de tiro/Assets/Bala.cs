using UnityEngine;
using System.Collections;

public class Bala : MonoBehaviour {


	public Rigidbody rb;
	void Start () 
	{
		rb = transform.GetComponent<Rigidbody> ();
	}
	void OnGUI(){
		
	}
	void OnTriggerEnter(Collider other)
	{
		if (other.gameObject.tag == "Meteoro") {
			corpo.Score = corpo.Score + 1;
		}
	}
	void Update () 
	{
		rb.velocity = transform.up * 15;
		Destroy (gameObject, 60);
	}
}
