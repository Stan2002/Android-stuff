new AlertDialog.Builder(this)
                        .setTitle("Title")
                        .setMessage("Message")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        //nothing
                                    }
                                }

                        ).create().show();
                
