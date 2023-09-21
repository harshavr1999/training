import * as React from 'react';
import Card from '@mui/material/Card';
import Avatar from '@mui/material/Avatar';
import { CardActionArea } from '@mui/material';
import { CardContent, Typography } from '@mui/material'

 const CardComp =({image, title, navigate,details})=> {
        return ( 
                <div>
                <Card sx={{ maxWidth: 400, boxShadow:7 ,width:500,height:350}}>
                   
                     <CardActionArea  href={navigate} >
                    <Avatar  alt="Remy Sharp" src={image} sx={{ height: 200, width: 200, paddingLeft:12 }} />
                    <CardContent>

                        <Typography sx={{paddingLeft:10}} gutterBottom variant="h4" component="div">
                        {title}
                        </Typography>
                        <Typography sx={{paddingLeft:9}} variant="body2" color="text.secondary">
                        {details}
                        </Typography>
                        </CardContent>
                    </CardActionArea>
                </Card>
                </div>
            
        );

    }

    export default CardComp;