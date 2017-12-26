using UnityEngine;
using System.Collections;

public class RespawnMeteoro5segundos : MonoBehaviour {

	// Use this for initialization
	public GameObject meteoro5;
	public Transform spawnDoMeteoro5;

	void Start () 
	{
		InvokeRepeating ("spawn", 0.0f, 20.0f);
	}
	void spawn() {
		Instantiate (meteoro5, spawnDoMeteoro5.position, spawnDoMeteoro5.rotation);
	}
	
	// Update is called once per frame
	void Update () {
	
	}
}
