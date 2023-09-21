import * as React from 'react';
import Card from '@mui/material/Card';
import Grid from '@mui/material/Grid';
import CardContent from '@mui/material/CardContent';
import Typography from '@mui/material/Typography';
import { CardActionArea } from '@mui/material';
import Container from '@mui/material/Container';
import ImageList from '@mui/material/ImageList';
import ImageListItem from '@mui/material/ImageListItem';
import Navbar from './RTOoperations/Navbar';
import Header from '../Header';



export default function RTOHome() {
    let cards = [
        {
            title: "Add Vehicle",
            description: "Add New Vehicle Details By Clicking Here",
            image: "RTOLOGO/addvehicle.png",
            link: '/addvehicle/',
            id: 1
        },
        {
            title: "Modify Vehicle",
            description: "Modify Vehicle Details By Clicking Here",
            image: "RTOLOGO/modifyvehicle.png",
            link: '/modifyvehicle/',
            id: 2
        },
        {
            title: "Show Vehicles",
            description: "View Vehicles By Clicking Here",
            image: "RTOLOGO/showAllVehicle.png",
            link: '/showallvehicle/',
            id: 3
        },
        {
            title: "Add Owner",
            description: "Add New Owner Details By Clicking Here",
            image: "RTOLOGO/addowner.png",
            link: '/addowner/',
            id: 4
        },
        {
            title: "Modify Owner",
            description: "Modify Owner Details By Clicking Here",
            image: "RTOLOGO/modifyowner.png",
            link: '/modifyowner/',
            id: 5
        },
        {
            title: "Show Owner",
            description: "View Owners By Clicking Here",
            image: "RTOLOGO/showAllOwner.png",
            link: '/showallowners/',
            id: 6
        },
        {
            title: "Add Offence Type",
            description: "Add Offence Type By Clicking Here",
            image: "RTOLOGO/addoffencetype.png",
            link: '/addoffencetype/',
            id: 7
        },
        {
            title: "Modify Offence Type",
            description: "Modify Offence Type By Clicking Here",
            image: "RTOLOGO/modifyoffencetype.png",
            link: '/modifyoffencetype/',
            id: 8
        },

        {
            title: "Show Offence Type",
            description: "View Offence Types By Clicking Here",
            image: "RTOLOGO/showalloffences.png",
            link: '/showalloffencetype/',
            id: 9
        },

        {
            title: "Vehicle Registration",
            description: "Register Vehicle By Clicking Here",
            image: "RTOLOGO/vehicleregistration.png",
            link: '/vehicleregistration/',
            id: 10
        },
        {
            title: "Transfer Vehicle",
            description: "Transfer Vehicle By Clicking Here",
            image: "RTOLOGO/transfervehicle.png",
            link: '/transfervehicle/',
            id: 11
        },
        {
            title: "Report Generation",
            description: "Generate Report By Clicking Here",
            image: "RTOLOGO/reportgeneration.png",
            link: '/reportgeneration/',
            id: 12
        }

    ]

    // let [gridCards, setCards] = useState(card)

    return (
        <React.Fragment><Navbar></Navbar>
            <Header>RTO HOME PAGE</Header>
            <Container sx={{ py: 8 }} maxWidth="lg">
                {/* End hero unit */}
                <Grid container spacing={1} >
                    {cards.map((card) => (
                        <Grid item key={card.id} xs={12} sm={6} md={4} p={3} lg={4}>
                            <CardActionArea component="a" href={card.link}>
                                <Card
                                    sx={{ height: '100%', display: 'flex', flexDirection: 'column' }}>
                                    <ImageList sx={{ width: 300, ml: 11 }} >
                                        <ImageListItem>
                                            <img src={card.image} alt={card.title} />
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
        </React.Fragment>

    );

}


