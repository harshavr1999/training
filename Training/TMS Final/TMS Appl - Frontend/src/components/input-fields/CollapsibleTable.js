import * as React from 'react';
import PropTypes from 'prop-types';
import Box from '@mui/material/Box';
import Collapse from '@mui/material/Collapse';
import IconButton from '@mui/material/IconButton';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Typography from '@mui/material/Typography';
import Paper from '@mui/material/Paper';
import KeyboardArrowDownIcon from '@mui/icons-material/KeyboardArrowDown';
import KeyboardArrowUpIcon from '@mui/icons-material/KeyboardArrowUp';

function Row(props) {
  const { row } = props;
  const [open, setOpen] = React.useState(false);

  return (
    <React.Fragment>
      <TableRow sx={{ '& > *': { borderBottom: 'unset' } }}>
        <TableCell>
          <IconButton
            aria-label="expand row"
            size="small"
            onClick={() => setOpen(!open)}
            sx={{color : '#8a2b06'}}
          >
            {open ? <KeyboardArrowUpIcon /> : <KeyboardArrowDownIcon />}
          </IconButton> <span style={{color : '#8a2b06'}}>Click for owner details</span>
        </TableCell>
        <TableCell align="right" scope='row'>{row.offenceDetailId}</TableCell>
        <TableCell align="right">{row.vehicleNumber}</TableCell>
        <TableCell align="right">{row.vehicleType}</TableCell>
        <TableCell align="right">{row.offenceType}</TableCell>
        <TableCell align="right">{row.date}</TableCell>
        <TableCell align="right">{row.status}</TableCell>
        <TableCell align="right">{row.reportedBy}</TableCell>
        <TableCell align="right">{row.place}</TableCell>
      </TableRow>
      <TableRow>
        <TableCell style={{ paddingBottom: 0, paddingTop: 0 }} colSpan={6}>
          <Collapse in={open} timeout="auto" unmountOnExit>
            <Box sx={{ margin: 1 }}>
              <Typography variant="h6" gutterBottom component="div" sx={{fontWeight : 'bold'}}>
                Owner Details
              </Typography>
              <Table size="small" aria-label="purchases">
                <TableHead>
                  <TableRow>
                    <TableCell sx={{fontWeight : 'bold'}}>Id</TableCell>
                    <TableCell sx={{fontWeight : 'bold'}}>Name </TableCell>
                    <TableCell sx={{fontWeight : 'bold'}}>Contact Number</TableCell>
                    <TableCell sx={{fontWeight : 'bold'}}>Address</TableCell>
                  </TableRow>
                </TableHead>
                <TableBody>
                    <TableRow key={row.owner.id}>
                      <TableCell component="th" scope="row">
                        {row.owner.id}
                      </TableCell>
                      <TableCell>{row.owner.name}</TableCell>
                      <TableCell>{row.owner.contactNumber}</TableCell>
                      <TableCell>
                        {row.owner.address}
                      </TableCell>
                    </TableRow>
                </TableBody>
              </Table>
            </Box>
          </Collapse>
        </TableCell>
      </TableRow>
    </React.Fragment>
  );
}

export default function CollapsibleTable(props) {
  return (
    <TableContainer component={Paper}>
      <Table aria-label="collapsible table">
        <TableHead>
          <TableRow>
            <TableCell />
            <TableCell align="right" sx={{fontWeight : 'bold'}}>Offence Detail Id</TableCell>
            <TableCell align="right" sx={{fontWeight : 'bold'}}>Vehicle Number</TableCell>
            <TableCell align="right" sx={{fontWeight : 'bold'}}>Vehicle Type</TableCell>
            <TableCell align="right" sx={{fontWeight : 'bold'}}>Offence Type</TableCell>
            <TableCell align="right" sx={{fontWeight : 'bold'}}>Committed Date </TableCell>
            <TableCell align="right" sx={{fontWeight : 'bold'}}>Status</TableCell>
            <TableCell align="right" sx={{fontWeight : 'bold'}}>Reported By</TableCell>
            <TableCell align="right" sx={{fontWeight : 'bold'}}>Committed Place</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {props.rows.map((row) => (
            <Row key={row.offenceDetailId} row={row} />
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
}