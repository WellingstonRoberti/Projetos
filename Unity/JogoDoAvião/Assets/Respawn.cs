using UnityEngine;
using System.Collections;

public class Respawn : MonoBehaviour {

	// Use this for initialization
	public GameObject Bola;
	//Transform LugarDaBola;

	// Use this for initialization
	void Start () 
	{
		InvokeRepeating ("spawn", 0f, 1.4f);
	}
	void spawn() {
		transform.position = new Vector3(Random.Range(-12f, 13f), 39.1f, 10);
		Instantiate(Bola, transform.position, Quaternion.identity);
	}
	
	// Update is called once per frame
	void Update () {
	
	}
}
