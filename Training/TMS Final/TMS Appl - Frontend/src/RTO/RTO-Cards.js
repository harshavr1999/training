import * as React from 'react';
import Card from '@mui/material/Card';
// import CardActions from '@mui/material/CardActions';
// import Button from '@mui/material/Button';
// import Avatar from '@mui/material/Avatar';
// import { useState } from 'react';
import Grid from '@mui/material/Unstable_Grid2';
import CardContent from '@mui/material/CardContent';
//import CardMedia from '@mui/material/CardMedia';
import Typography from '@mui/material/Typography';
import { CardActionArea } from '@mui/material';
import Container from '@mui/material/Container';
import ImageList from '@mui/material/ImageList';
import ImageListItem from '@mui/material/ImageListItem';
// import {Link } from 'react-router-dom';



export default function Cards() {


    let cards = [
        {
            title: "Transfer Vehicle",
            description: "You can transfer vehicle by Clicking",
            image: "./Transfer-vehicle.png",
            link: '/Transfervehicle',
            id: 1
        },
 

    
    ]


    return (

        <Container sx={{ py: 8 }} maxWidth="lg">
        {/* End hero unit */}
        <Grid container spacing={1}>
            {cards.map((card) => (
                <Grid item key={card} xs={12} sm={6} md={4} p={3} lg={4} >
                    <CardActionArea component="a" href={card.link} boxShadow={7} >
                       
                        <Card
                            sx={{ height: '100%', display: 'flex', flexDirection: 'column' }}
                        >
                            <ImageList sx={{ width: 300, ml:4 }} >
                                <ImageListItem>
                                    <img src={card.image} alt="Google" />
                                </ImageListItem>
                            </ImageList>
                            <CardContent sx={{ flexGrow: 1 }}>
                                <Typography gutterBottom variant="h5" component="h2">
                                    {card.title}
                                </Typography>
                                <Typography>
                                    {card.description}
                                </Typography>
                            </CardContent>

                        </Card>
                    </CardActionArea>
                </Grid>
            ))}
        </Grid>
    </Container>







    );

}




